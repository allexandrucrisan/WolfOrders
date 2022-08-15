package com.veselovvv.movies.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/veselovvv/movies/data/NetworkState;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "Companion", "app_debug"})
public final class NetworkState {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.veselovvv.movies.data.NetworkState.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.veselovvv.movies.data.NetworkState LOADED = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.veselovvv.movies.data.NetworkState LOADING = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.veselovvv.movies.data.NetworkState ERROR = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.veselovvv.movies.data.NetworkState END_OF_LIST = null;
    
    public NetworkState(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/veselovvv/movies/data/NetworkState$Companion;", "", "()V", "END_OF_LIST", "Lcom/veselovvv/movies/data/NetworkState;", "getEND_OF_LIST", "()Lcom/veselovvv/movies/data/NetworkState;", "ERROR", "getERROR", "LOADED", "getLOADED", "LOADING", "getLOADING", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.veselovvv.movies.data.NetworkState getLOADED() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.veselovvv.movies.data.NetworkState getLOADING() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.veselovvv.movies.data.NetworkState getERROR() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.veselovvv.movies.data.NetworkState getEND_OF_LIST() {
            return null;
        }
    }
}