package com.dx168.patchsdk;

/**
 * Created by jianjun.lin on 2017/3/10.
 */
public class LoadedPatch {

    public final String version;
    public final String hash;
    public final String uid;
    public final long patchSize;
    public final String path;

    public LoadedPatch(String version, String uid, String hash, long patchSize, String path) {
        this.path = path;
        this.version = version;
        this.hash = hash;
        this.uid = uid;
        this.patchSize = patchSize;
    }
}
