// Automatically generated by flapigen
package com.toeverything.jwst.lib;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class Block {

    public Block(@NonNull Workspace workspace, @NonNull String block_id, @NonNull String flavor, long operator) {
        long a0 = workspace.mNativeObj;
        mNativeObj = init(a0, block_id, flavor, operator);
        JNIReachabilityFence.reachabilityFence1(workspace);
    }
    private static native long init(long workspace, @NonNull String block_id, @NonNull String flavor, long operator);

    public final void setBool(@NonNull WorkspaceTransaction trx, @NonNull String key, boolean value) {
        long a0 = trx.mNativeObj;
        do_setBool(mNativeObj, a0, key, value);

        JNIReachabilityFence.reachabilityFence1(trx);
    }
    private static native void do_setBool(long self, long trx, @NonNull String key, boolean value);

    public final void setString(@NonNull WorkspaceTransaction trx, @NonNull String key, @NonNull String value) {
        long a0 = trx.mNativeObj;
        do_setString(mNativeObj, a0, key, value);

        JNIReachabilityFence.reachabilityFence1(trx);
    }
    private static native void do_setString(long self, long trx, @NonNull String key, @NonNull String value);

    public final void setFloat(@NonNull WorkspaceTransaction trx, @NonNull String key, double value) {
        long a0 = trx.mNativeObj;
        do_setFloat(mNativeObj, a0, key, value);

        JNIReachabilityFence.reachabilityFence1(trx);
    }
    private static native void do_setFloat(long self, long trx, @NonNull String key, double value);

    public final void setInteger(@NonNull WorkspaceTransaction trx, @NonNull String key, long value) {
        long a0 = trx.mNativeObj;
        do_setInteger(mNativeObj, a0, key, value);

        JNIReachabilityFence.reachabilityFence1(trx);
    }
    private static native void do_setInteger(long self, long trx, @NonNull String key, long value);

    public final void setNull(@NonNull WorkspaceTransaction trx, @NonNull String key) {
        long a0 = trx.mNativeObj;
        do_setNull(mNativeObj, a0, key);

        JNIReachabilityFence.reachabilityFence1(trx);
    }
    private static native void do_setNull(long self, long trx, @NonNull String key);

    public final boolean isBool(@NonNull String key) {
        boolean ret = do_isBool(mNativeObj, key);

        return ret;
    }
    private static native boolean do_isBool(long self, @NonNull String key);

    public final boolean isString(@NonNull String key) {
        boolean ret = do_isString(mNativeObj, key);

        return ret;
    }
    private static native boolean do_isString(long self, @NonNull String key);

    public final boolean isFloat(@NonNull String key) {
        boolean ret = do_isFloat(mNativeObj, key);

        return ret;
    }
    private static native boolean do_isFloat(long self, @NonNull String key);

    public final boolean isInteger(@NonNull String key) {
        boolean ret = do_isInteger(mNativeObj, key);

        return ret;
    }
    private static native boolean do_isInteger(long self, @NonNull String key);

    public final @NonNull java.util.OptionalLong getBool(@NonNull String key) {
        java.util.OptionalLong ret = do_getBool(mNativeObj, key);

        return ret;
    }
    private static native @NonNull java.util.OptionalLong do_getBool(long self, @NonNull String key);

    public final @NonNull java.util.Optional<String> getString(@NonNull String key) {
        String ret = do_getString(mNativeObj, key);
        java.util.Optional<String> convRet = java.util.Optional.ofNullable(ret);

        return convRet;
    }
    private static native @Nullable String do_getString(long self, @NonNull String key);

    public final @NonNull java.util.OptionalDouble getFloat(@NonNull String key) {
        java.util.OptionalDouble ret = do_getFloat(mNativeObj, key);

        return ret;
    }
    private static native @NonNull java.util.OptionalDouble do_getFloat(long self, @NonNull String key);

    public final @NonNull java.util.OptionalLong getInteger(@NonNull String key) {
        java.util.OptionalLong ret = do_getInteger(mNativeObj, key);

        return ret;
    }
    private static native @NonNull java.util.OptionalLong do_getInteger(long self, @NonNull String key);

    public final @NonNull String id() {
        String ret = do_id(mNativeObj);

        return ret;
    }
    private static native @NonNull String do_id(long self);

    public final @NonNull String flavor() {
        String ret = do_flavor(mNativeObj);

        return ret;
    }
    private static native @NonNull String do_flavor(long self);

    public final @NonNull String version() {
        String ret = do_version(mNativeObj);

        return ret;
    }
    private static native @NonNull String do_version(long self);

    public final long created() {
        long ret = do_created(mNativeObj);

        return ret;
    }
    private static native long do_created(long self);

    public final long updated() {
        long ret = do_updated(mNativeObj);

        return ret;
    }
    private static native long do_updated(long self);

    public final @NonNull java.util.Optional<String> parent() {
        String ret = do_parent(mNativeObj);
        java.util.Optional<String> convRet = java.util.Optional.ofNullable(ret);

        return convRet;
    }
    private static native @Nullable String do_parent(long self);

    public final @NonNull java.lang.String [] children() {
        java.lang.String [] ret = do_children(mNativeObj);

        return ret;
    }
    private static native @NonNull java.lang.String [] do_children(long self);

    public final void pushChildren(@NonNull WorkspaceTransaction trx, @NonNull Block block) {
        long a0 = trx.mNativeObj;        long a1 = block.mNativeObj;
        do_pushChildren(mNativeObj, a0, a1);

        JNIReachabilityFence.reachabilityFence2(trx, block);
    }
    private static native void do_pushChildren(long self, long trx, long block);

    public final void insertChildrenAt(@NonNull WorkspaceTransaction trx, @NonNull Block block, long pos) {
        long a0 = trx.mNativeObj;        long a1 = block.mNativeObj;
        do_insertChildrenAt(mNativeObj, a0, a1, pos);

        JNIReachabilityFence.reachabilityFence2(trx, block);
    }
    private static native void do_insertChildrenAt(long self, long trx, long block, long pos);

    public final void insertChildrenBefore(@NonNull WorkspaceTransaction trx, @NonNull Block block, @NonNull String reference) {
        long a0 = trx.mNativeObj;        long a1 = block.mNativeObj;
        do_insertChildrenBefore(mNativeObj, a0, a1, reference);

        JNIReachabilityFence.reachabilityFence2(trx, block);
    }
    private static native void do_insertChildrenBefore(long self, long trx, long block, @NonNull String reference);

    public final void insertChildrenAfter(@NonNull WorkspaceTransaction trx, @NonNull Block block, @NonNull String reference) {
        long a0 = trx.mNativeObj;        long a1 = block.mNativeObj;
        do_insertChildrenAfter(mNativeObj, a0, a1, reference);

        JNIReachabilityFence.reachabilityFence2(trx, block);
    }
    private static native void do_insertChildrenAfter(long self, long trx, long block, @NonNull String reference);

    public final void removeChildren(@NonNull WorkspaceTransaction trx, @NonNull Block block) {
        long a0 = trx.mNativeObj;        long a1 = block.mNativeObj;
        do_removeChildren(mNativeObj, a0, a1);

        JNIReachabilityFence.reachabilityFence2(trx, block);
    }
    private static native void do_removeChildren(long self, long trx, long block);

    public final int existsChildren(@NonNull String block_id) {
        int ret = do_existsChildren(mNativeObj, block_id);

        return ret;
    }
    private static native int do_existsChildren(long self, @NonNull String block_id);

    public synchronized void delete() {
        if (mNativeObj != 0) {
            do_delete(mNativeObj);
            mNativeObj = 0;
       }
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            delete();
        }
        finally {
             super.finalize();
        }
    }
    private static native void do_delete(long me);
    /*package*/ Block(InternalPointerMarker marker, long ptr) {
        assert marker == InternalPointerMarker.RAW_PTR;
        this.mNativeObj = ptr;
    }
    /*package*/ long mNativeObj;
}