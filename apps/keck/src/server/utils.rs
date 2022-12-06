use super::*;
use dashmap::mapref::{entry::Entry, one::RefMut};
use jwst::Workspace;
use tokio::sync::Mutex;

pub use jwst_logger::{debug, error, info, warn};
pub use serde::{Deserialize, Serialize};
pub use uuid::Uuid;

pub async fn init_workspace<'a>(
    context: &'a Context,
    workspace: &str,
) -> Result<RefMut<'a, String, Mutex<Workspace>>, anyhow::Error> {
    match context.workspace.entry(workspace.to_owned()) {
        Entry::Vacant(entry) => {
            let doc = context.docs.create_doc(workspace).await?;

            Ok(entry.insert(Mutex::new(Workspace::from_doc(doc, workspace))))
        }
        Entry::Occupied(o) => Ok(o.into_ref()),
    }
}
