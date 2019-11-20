/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.android.media;
/**
 * Interface from MediaSession2 to MediaController2.
 * <p>
 * Keep this interface oneway. Otherwise a malicious app may implement fake version of this,
 * and holds calls from session to make session owner(s) frozen.
 */// TODO(jaewan): (Post P) Handle when the playlist becomes too huge.
//               Note that ParcelledSliceList isn't a good idea for the purpose. (see: b/37493677)

public interface IMediaController2 extends android.os.IInterface
{
  /** Default implementation for IMediaController2. */
  public static class Default implements com.android.media.IMediaController2
  {
    @Override public void onPlayerStateChanged(int state) throws android.os.RemoteException
    {
    }
    @Override public void onPositionChanged(long eventTimeMs, long positionMs) throws android.os.RemoteException
    {
    }
    @Override public void onPlaybackSpeedChanged(float speed) throws android.os.RemoteException
    {
    }
    @Override public void onBufferedPositionChanged(long bufferedPositionMs) throws android.os.RemoteException
    {
    }
    @Override public void onPlaylistChanged(java.util.List<android.os.Bundle> playlist, android.os.Bundle metadata) throws android.os.RemoteException
    {
    }
    @Override public void onPlaylistMetadataChanged(android.os.Bundle metadata) throws android.os.RemoteException
    {
    }
    @Override public void onPlaybackInfoChanged(android.os.Bundle playbackInfo) throws android.os.RemoteException
    {
    }
    @Override public void onRepeatModeChanged(int repeatMode) throws android.os.RemoteException
    {
    }
    @Override public void onShuffleModeChanged(int shuffleMode) throws android.os.RemoteException
    {
    }
    @Override public void onError(int errorCode, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void onConnected(com.android.media.IMediaSession2 sessionBinder, android.os.Bundle commandGroup, int playerState, long positionEventTimeMs, long positionMs, float playbackSpeed, long bufferedPositionMs, android.os.Bundle playbackInfo, int repeatMode, int shuffleMode, java.util.List<android.os.Bundle> playlist, android.app.PendingIntent sessionActivity) throws android.os.RemoteException
    {
    }
    @Override public void onDisconnected() throws android.os.RemoteException
    {
    }
    @Override public void onCustomLayoutChanged(java.util.List<android.os.Bundle> commandButtonlist) throws android.os.RemoteException
    {
    }
    @Override public void onAllowedCommandsChanged(android.os.Bundle commands) throws android.os.RemoteException
    {
    }
    @Override public void onCustomCommand(android.os.Bundle command, android.os.Bundle args, android.os.ResultReceiver receiver) throws android.os.RemoteException
    {
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    // Browser sepcific
    //////////////////////////////////////////////////////////////////////////////////////////////

    @Override public void onGetLibraryRootDone(android.os.Bundle rootHints, java.lang.String rootMediaId, android.os.Bundle rootExtra) throws android.os.RemoteException
    {
    }
    @Override public void onGetItemDone(java.lang.String mediaId, android.os.Bundle result) throws android.os.RemoteException
    {
    }
    @Override public void onChildrenChanged(java.lang.String rootMediaId, int itemCount, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void onGetChildrenDone(java.lang.String parentId, int page, int pageSize, java.util.List<android.os.Bundle> result, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void onSearchResultChanged(java.lang.String query, int itemCount, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void onGetSearchResultDone(java.lang.String query, int page, int pageSize, java.util.List<android.os.Bundle> result, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.android.media.IMediaController2
  {
    private static final java.lang.String DESCRIPTOR = "com.android.media.IMediaController2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.android.media.IMediaController2 interface,
     * generating a proxy if needed.
     */
    public static com.android.media.IMediaController2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.android.media.IMediaController2))) {
        return ((com.android.media.IMediaController2)iin);
      }
      return new com.android.media.IMediaController2.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_onPlayerStateChanged:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onPlayerStateChanged(_arg0);
          return true;
        }
        case TRANSACTION_onPositionChanged:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          long _arg1;
          _arg1 = data.readLong();
          this.onPositionChanged(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onPlaybackSpeedChanged:
        {
          data.enforceInterface(descriptor);
          float _arg0;
          _arg0 = data.readFloat();
          this.onPlaybackSpeedChanged(_arg0);
          return true;
        }
        case TRANSACTION_onBufferedPositionChanged:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          this.onBufferedPositionChanged(_arg0);
          return true;
        }
        case TRANSACTION_onPlaylistChanged:
        {
          data.enforceInterface(descriptor);
          java.util.List<android.os.Bundle> _arg0;
          _arg0 = data.createTypedArrayList(android.os.Bundle.CREATOR);
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onPlaylistChanged(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onPlaylistMetadataChanged:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onPlaylistMetadataChanged(_arg0);
          return true;
        }
        case TRANSACTION_onPlaybackInfoChanged:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onPlaybackInfoChanged(_arg0);
          return true;
        }
        case TRANSACTION_onRepeatModeChanged:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onRepeatModeChanged(_arg0);
          return true;
        }
        case TRANSACTION_onShuffleModeChanged:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.onShuffleModeChanged(_arg0);
          return true;
        }
        case TRANSACTION_onError:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onError(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onConnected:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaSession2 _arg0;
          _arg0 = com.android.media.IMediaSession2.Stub.asInterface(data.readStrongBinder());
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          int _arg2;
          _arg2 = data.readInt();
          long _arg3;
          _arg3 = data.readLong();
          long _arg4;
          _arg4 = data.readLong();
          float _arg5;
          _arg5 = data.readFloat();
          long _arg6;
          _arg6 = data.readLong();
          android.os.Bundle _arg7;
          if ((0!=data.readInt())) {
            _arg7 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg7 = null;
          }
          int _arg8;
          _arg8 = data.readInt();
          int _arg9;
          _arg9 = data.readInt();
          java.util.List<android.os.Bundle> _arg10;
          _arg10 = data.createTypedArrayList(android.os.Bundle.CREATOR);
          android.app.PendingIntent _arg11;
          if ((0!=data.readInt())) {
            _arg11 = android.app.PendingIntent.CREATOR.createFromParcel(data);
          }
          else {
            _arg11 = null;
          }
          this.onConnected(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9, _arg10, _arg11);
          return true;
        }
        case TRANSACTION_onDisconnected:
        {
          data.enforceInterface(descriptor);
          this.onDisconnected();
          return true;
        }
        case TRANSACTION_onCustomLayoutChanged:
        {
          data.enforceInterface(descriptor);
          java.util.List<android.os.Bundle> _arg0;
          _arg0 = data.createTypedArrayList(android.os.Bundle.CREATOR);
          this.onCustomLayoutChanged(_arg0);
          return true;
        }
        case TRANSACTION_onAllowedCommandsChanged:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onAllowedCommandsChanged(_arg0);
          return true;
        }
        case TRANSACTION_onCustomCommand:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          android.os.ResultReceiver _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.ResultReceiver.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.onCustomCommand(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_onGetLibraryRootDone:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.onGetLibraryRootDone(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_onGetItemDone:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onGetItemDone(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_onChildrenChanged:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.onChildrenChanged(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_onGetChildrenDone:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          java.util.List<android.os.Bundle> _arg3;
          _arg3 = data.createTypedArrayList(android.os.Bundle.CREATOR);
          android.os.Bundle _arg4;
          if ((0!=data.readInt())) {
            _arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg4 = null;
          }
          this.onGetChildrenDone(_arg0, _arg1, _arg2, _arg3, _arg4);
          return true;
        }
        case TRANSACTION_onSearchResultChanged:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.onSearchResultChanged(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_onGetSearchResultDone:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          java.util.List<android.os.Bundle> _arg3;
          _arg3 = data.createTypedArrayList(android.os.Bundle.CREATOR);
          android.os.Bundle _arg4;
          if ((0!=data.readInt())) {
            _arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg4 = null;
          }
          this.onGetSearchResultDone(_arg0, _arg1, _arg2, _arg3, _arg4);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.android.media.IMediaController2
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void onPlayerStateChanged(int state) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(state);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPlayerStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPlayerStateChanged(state);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onPositionChanged(long eventTimeMs, long positionMs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(eventTimeMs);
          _data.writeLong(positionMs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPositionChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPositionChanged(eventTimeMs, positionMs);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onPlaybackSpeedChanged(float speed) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloat(speed);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPlaybackSpeedChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPlaybackSpeedChanged(speed);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onBufferedPositionChanged(long bufferedPositionMs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(bufferedPositionMs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onBufferedPositionChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onBufferedPositionChanged(bufferedPositionMs);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onPlaylistChanged(java.util.List<android.os.Bundle> playlist, android.os.Bundle metadata) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedList(playlist);
          if ((metadata!=null)) {
            _data.writeInt(1);
            metadata.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPlaylistChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPlaylistChanged(playlist, metadata);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onPlaylistMetadataChanged(android.os.Bundle metadata) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((metadata!=null)) {
            _data.writeInt(1);
            metadata.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPlaylistMetadataChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPlaylistMetadataChanged(metadata);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onPlaybackInfoChanged(android.os.Bundle playbackInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((playbackInfo!=null)) {
            _data.writeInt(1);
            playbackInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPlaybackInfoChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onPlaybackInfoChanged(playbackInfo);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onRepeatModeChanged(int repeatMode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(repeatMode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRepeatModeChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onRepeatModeChanged(repeatMode);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onShuffleModeChanged(int shuffleMode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(shuffleMode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onShuffleModeChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onShuffleModeChanged(shuffleMode);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onError(int errorCode, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(errorCode);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onError(errorCode, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onConnected(com.android.media.IMediaSession2 sessionBinder, android.os.Bundle commandGroup, int playerState, long positionEventTimeMs, long positionMs, float playbackSpeed, long bufferedPositionMs, android.os.Bundle playbackInfo, int repeatMode, int shuffleMode, java.util.List<android.os.Bundle> playlist, android.app.PendingIntent sessionActivity) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((sessionBinder!=null))?(sessionBinder.asBinder()):(null)));
          if ((commandGroup!=null)) {
            _data.writeInt(1);
            commandGroup.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(playerState);
          _data.writeLong(positionEventTimeMs);
          _data.writeLong(positionMs);
          _data.writeFloat(playbackSpeed);
          _data.writeLong(bufferedPositionMs);
          if ((playbackInfo!=null)) {
            _data.writeInt(1);
            playbackInfo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeInt(repeatMode);
          _data.writeInt(shuffleMode);
          _data.writeTypedList(playlist);
          if ((sessionActivity!=null)) {
            _data.writeInt(1);
            sessionActivity.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onConnected(sessionBinder, commandGroup, playerState, positionEventTimeMs, positionMs, playbackSpeed, bufferedPositionMs, playbackInfo, repeatMode, shuffleMode, playlist, sessionActivity);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onDisconnected() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onDisconnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onDisconnected();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onCustomLayoutChanged(java.util.List<android.os.Bundle> commandButtonlist) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedList(commandButtonlist);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCustomLayoutChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onCustomLayoutChanged(commandButtonlist);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onAllowedCommandsChanged(android.os.Bundle commands) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((commands!=null)) {
            _data.writeInt(1);
            commands.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onAllowedCommandsChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onAllowedCommandsChanged(commands);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onCustomCommand(android.os.Bundle command, android.os.Bundle args, android.os.ResultReceiver receiver) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((command!=null)) {
            _data.writeInt(1);
            command.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((args!=null)) {
            _data.writeInt(1);
            args.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((receiver!=null)) {
            _data.writeInt(1);
            receiver.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCustomCommand, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onCustomCommand(command, args, receiver);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      //////////////////////////////////////////////////////////////////////////////////////////////
      // Browser sepcific
      //////////////////////////////////////////////////////////////////////////////////////////////

      @Override public void onGetLibraryRootDone(android.os.Bundle rootHints, java.lang.String rootMediaId, android.os.Bundle rootExtra) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((rootHints!=null)) {
            _data.writeInt(1);
            rootHints.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          _data.writeString(rootMediaId);
          if ((rootExtra!=null)) {
            _data.writeInt(1);
            rootExtra.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onGetLibraryRootDone, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onGetLibraryRootDone(rootHints, rootMediaId, rootExtra);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onGetItemDone(java.lang.String mediaId, android.os.Bundle result) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(mediaId);
          if ((result!=null)) {
            _data.writeInt(1);
            result.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onGetItemDone, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onGetItemDone(mediaId, result);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onChildrenChanged(java.lang.String rootMediaId, int itemCount, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(rootMediaId);
          _data.writeInt(itemCount);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onChildrenChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onChildrenChanged(rootMediaId, itemCount, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onGetChildrenDone(java.lang.String parentId, int page, int pageSize, java.util.List<android.os.Bundle> result, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(parentId);
          _data.writeInt(page);
          _data.writeInt(pageSize);
          _data.writeTypedList(result);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onGetChildrenDone, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onGetChildrenDone(parentId, page, pageSize, result, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onSearchResultChanged(java.lang.String query, int itemCount, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(query);
          _data.writeInt(itemCount);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSearchResultChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onSearchResultChanged(query, itemCount, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onGetSearchResultDone(java.lang.String query, int page, int pageSize, java.util.List<android.os.Bundle> result, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(query);
          _data.writeInt(page);
          _data.writeInt(pageSize);
          _data.writeTypedList(result);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onGetSearchResultDone, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onGetSearchResultDone(query, page, pageSize, result, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.android.media.IMediaController2 sDefaultImpl;
    }
    static final int TRANSACTION_onPlayerStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onPositionChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onPlaybackSpeedChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onBufferedPositionChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onPlaylistChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_onPlaylistMetadataChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_onPlaybackInfoChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_onRepeatModeChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_onShuffleModeChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_onConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_onDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_onCustomLayoutChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_onAllowedCommandsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_onCustomCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_onGetLibraryRootDone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_onGetItemDone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_onChildrenChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_onGetChildrenDone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_onSearchResultChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_onGetSearchResultDone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    public static boolean setDefaultImpl(com.android.media.IMediaController2 impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.android.media.IMediaController2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void onPlayerStateChanged(int state) throws android.os.RemoteException;
  public void onPositionChanged(long eventTimeMs, long positionMs) throws android.os.RemoteException;
  public void onPlaybackSpeedChanged(float speed) throws android.os.RemoteException;
  public void onBufferedPositionChanged(long bufferedPositionMs) throws android.os.RemoteException;
  public void onPlaylistChanged(java.util.List<android.os.Bundle> playlist, android.os.Bundle metadata) throws android.os.RemoteException;
  public void onPlaylistMetadataChanged(android.os.Bundle metadata) throws android.os.RemoteException;
  public void onPlaybackInfoChanged(android.os.Bundle playbackInfo) throws android.os.RemoteException;
  public void onRepeatModeChanged(int repeatMode) throws android.os.RemoteException;
  public void onShuffleModeChanged(int shuffleMode) throws android.os.RemoteException;
  public void onError(int errorCode, android.os.Bundle extras) throws android.os.RemoteException;
  public void onConnected(com.android.media.IMediaSession2 sessionBinder, android.os.Bundle commandGroup, int playerState, long positionEventTimeMs, long positionMs, float playbackSpeed, long bufferedPositionMs, android.os.Bundle playbackInfo, int repeatMode, int shuffleMode, java.util.List<android.os.Bundle> playlist, android.app.PendingIntent sessionActivity) throws android.os.RemoteException;
  public void onDisconnected() throws android.os.RemoteException;
  public void onCustomLayoutChanged(java.util.List<android.os.Bundle> commandButtonlist) throws android.os.RemoteException;
  public void onAllowedCommandsChanged(android.os.Bundle commands) throws android.os.RemoteException;
  public void onCustomCommand(android.os.Bundle command, android.os.Bundle args, android.os.ResultReceiver receiver) throws android.os.RemoteException;
  //////////////////////////////////////////////////////////////////////////////////////////////
  // Browser sepcific
  //////////////////////////////////////////////////////////////////////////////////////////////

  public void onGetLibraryRootDone(android.os.Bundle rootHints, java.lang.String rootMediaId, android.os.Bundle rootExtra) throws android.os.RemoteException;
  public void onGetItemDone(java.lang.String mediaId, android.os.Bundle result) throws android.os.RemoteException;
  public void onChildrenChanged(java.lang.String rootMediaId, int itemCount, android.os.Bundle extras) throws android.os.RemoteException;
  public void onGetChildrenDone(java.lang.String parentId, int page, int pageSize, java.util.List<android.os.Bundle> result, android.os.Bundle extras) throws android.os.RemoteException;
  public void onSearchResultChanged(java.lang.String query, int itemCount, android.os.Bundle extras) throws android.os.RemoteException;
  public void onGetSearchResultDone(java.lang.String query, int page, int pageSize, java.util.List<android.os.Bundle> result, android.os.Bundle extras) throws android.os.RemoteException;
}
