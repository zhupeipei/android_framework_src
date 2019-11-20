/*___Generated_by_IDEA___*/

/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.android.media;
/**
 * Interface from MediaController2 to MediaSession2.
 * <p>
 * Keep this interface oneway. Otherwise a malicious app may implement fake version of this,
 * and holds calls from session to make session owner(s) frozen.
 */// TODO(jaewan): (Post P) Handle when the playlist becomes too huge.
//               Note that ParcelledSliceList isn't a good idea for the purpose. (see: b/37493677)

public interface IMediaSession2 extends android.os.IInterface
{
  /** Default implementation for IMediaSession2. */
  public static class Default implements com.android.media.IMediaSession2
  {
    // TODO(jaewan): add onCommand() to send private command
    // TODO(jaewan): (Post P) We may consider to add another binder just for the connection
    //               not to expose other methods to the controller whose connection wasn't accepted.
    //               But this would be enough for now because it's the same as existing
    //               MediaBrowser and MediaBrowserService.

    @Override public void connect(com.android.media.IMediaController2 caller, java.lang.String callingPackage) throws android.os.RemoteException
    {
    }
    @Override public void release(com.android.media.IMediaController2 caller) throws android.os.RemoteException
    {
    }
    @Override public void setVolumeTo(com.android.media.IMediaController2 caller, int value, int flags) throws android.os.RemoteException
    {
    }
    @Override public void adjustVolume(com.android.media.IMediaController2 caller, int direction, int flags) throws android.os.RemoteException
    {
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    // send command
    //////////////////////////////////////////////////////////////////////////////////////////////

    @Override public void sendTransportControlCommand(com.android.media.IMediaController2 caller, int commandCode, android.os.Bundle args) throws android.os.RemoteException
    {
    }
    @Override public void sendCustomCommand(com.android.media.IMediaController2 caller, android.os.Bundle command, android.os.Bundle args, android.os.ResultReceiver receiver) throws android.os.RemoteException
    {
    }
    @Override public void prepareFromUri(com.android.media.IMediaController2 caller, android.net.Uri uri, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void prepareFromSearch(com.android.media.IMediaController2 caller, java.lang.String query, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void prepareFromMediaId(com.android.media.IMediaController2 caller, java.lang.String mediaId, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void playFromUri(com.android.media.IMediaController2 caller, android.net.Uri uri, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void playFromSearch(com.android.media.IMediaController2 caller, java.lang.String query, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void playFromMediaId(com.android.media.IMediaController2 caller, java.lang.String mediaId, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void setRating(com.android.media.IMediaController2 caller, java.lang.String mediaId, android.os.Bundle rating) throws android.os.RemoteException
    {
    }
    @Override public void setPlaylist(com.android.media.IMediaController2 caller, java.util.List<android.os.Bundle> playlist, android.os.Bundle metadata) throws android.os.RemoteException
    {
    }
    @Override public void updatePlaylistMetadata(com.android.media.IMediaController2 caller, android.os.Bundle metadata) throws android.os.RemoteException
    {
    }
    @Override public void addPlaylistItem(com.android.media.IMediaController2 caller, int index, android.os.Bundle mediaItem) throws android.os.RemoteException
    {
    }
    @Override public void removePlaylistItem(com.android.media.IMediaController2 caller, android.os.Bundle mediaItem) throws android.os.RemoteException
    {
    }
    @Override public void replacePlaylistItem(com.android.media.IMediaController2 caller, int index, android.os.Bundle mediaItem) throws android.os.RemoteException
    {
    }
    @Override public void skipToPlaylistItem(com.android.media.IMediaController2 caller, android.os.Bundle mediaItem) throws android.os.RemoteException
    {
    }
    @Override public void skipToPreviousItem(com.android.media.IMediaController2 caller) throws android.os.RemoteException
    {
    }
    @Override public void skipToNextItem(com.android.media.IMediaController2 caller) throws android.os.RemoteException
    {
    }
    @Override public void setRepeatMode(com.android.media.IMediaController2 caller, int repeatMode) throws android.os.RemoteException
    {
    }
    @Override public void setShuffleMode(com.android.media.IMediaController2 caller, int shuffleMode) throws android.os.RemoteException
    {
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    // library service specific
    //////////////////////////////////////////////////////////////////////////////////////////////

    @Override public void getLibraryRoot(com.android.media.IMediaController2 caller, android.os.Bundle rootHints) throws android.os.RemoteException
    {
    }
    @Override public void getItem(com.android.media.IMediaController2 caller, java.lang.String mediaId) throws android.os.RemoteException
    {
    }
    @Override public void getChildren(com.android.media.IMediaController2 caller, java.lang.String parentId, int page, int pageSize, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void search(com.android.media.IMediaController2 caller, java.lang.String query, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void getSearchResult(com.android.media.IMediaController2 caller, java.lang.String query, int page, int pageSize, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void subscribe(com.android.media.IMediaController2 caller, java.lang.String parentId, android.os.Bundle extras) throws android.os.RemoteException
    {
    }
    @Override public void unsubscribe(com.android.media.IMediaController2 caller, java.lang.String parentId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.android.media.IMediaSession2
  {
    private static final java.lang.String DESCRIPTOR = "com.android.media.IMediaSession2";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.android.media.IMediaSession2 interface,
     * generating a proxy if needed.
     */
    public static com.android.media.IMediaSession2 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.android.media.IMediaSession2))) {
        return ((com.android.media.IMediaSession2)iin);
      }
      return new com.android.media.IMediaSession2.Stub.Proxy(obj);
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
        case TRANSACTION_connect:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.connect(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_release:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          this.release(_arg0);
          return true;
        }
        case TRANSACTION_setVolumeTo:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.setVolumeTo(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_adjustVolume:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.adjustVolume(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_sendTransportControlCommand:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.sendTransportControlCommand(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_sendCustomCommand:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          android.os.ResultReceiver _arg3;
          if ((0!=data.readInt())) {
            _arg3 = android.os.ResultReceiver.CREATOR.createFromParcel(data);
          }
          else {
            _arg3 = null;
          }
          this.sendCustomCommand(_arg0, _arg1, _arg2, _arg3);
          return true;
        }
        case TRANSACTION_prepareFromUri:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          android.net.Uri _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.net.Uri.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.prepareFromUri(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_prepareFromSearch:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.prepareFromSearch(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_prepareFromMediaId:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.prepareFromMediaId(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_playFromUri:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          android.net.Uri _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.net.Uri.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.playFromUri(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_playFromSearch:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.playFromSearch(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_playFromMediaId:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.playFromMediaId(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_setRating:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.setRating(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_setPlaylist:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.util.List<android.os.Bundle> _arg1;
          _arg1 = data.createTypedArrayList(android.os.Bundle.CREATOR);
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.setPlaylist(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_updatePlaylistMetadata:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.updatePlaylistMetadata(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_addPlaylistItem:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.addPlaylistItem(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_removePlaylistItem:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.removePlaylistItem(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_replacePlaylistItem:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.replacePlaylistItem(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_skipToPlaylistItem:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.skipToPlaylistItem(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_skipToPreviousItem:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          this.skipToPreviousItem(_arg0);
          return true;
        }
        case TRANSACTION_skipToNextItem:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          this.skipToNextItem(_arg0);
          return true;
        }
        case TRANSACTION_setRepeatMode:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          this.setRepeatMode(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_setShuffleMode:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          this.setShuffleMode(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_getLibraryRoot:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.getLibraryRoot(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_getItem:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.getItem(_arg0, _arg1);
          return true;
        }
        case TRANSACTION_getChildren:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          android.os.Bundle _arg4;
          if ((0!=data.readInt())) {
            _arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg4 = null;
          }
          this.getChildren(_arg0, _arg1, _arg2, _arg3, _arg4);
          return true;
        }
        case TRANSACTION_search:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.search(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_getSearchResult:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          android.os.Bundle _arg4;
          if ((0!=data.readInt())) {
            _arg4 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg4 = null;
          }
          this.getSearchResult(_arg0, _arg1, _arg2, _arg3, _arg4);
          return true;
        }
        case TRANSACTION_subscribe:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          android.os.Bundle _arg2;
          if ((0!=data.readInt())) {
            _arg2 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg2 = null;
          }
          this.subscribe(_arg0, _arg1, _arg2);
          return true;
        }
        case TRANSACTION_unsubscribe:
        {
          data.enforceInterface(descriptor);
          com.android.media.IMediaController2 _arg0;
          _arg0 = com.android.media.IMediaController2.Stub.asInterface(data.readStrongBinder());
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.unsubscribe(_arg0, _arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.android.media.IMediaSession2
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
      // TODO(jaewan): add onCommand() to send private command
      // TODO(jaewan): (Post P) We may consider to add another binder just for the connection
      //               not to expose other methods to the controller whose connection wasn't accepted.
      //               But this would be enough for now because it's the same as existing
      //               MediaBrowser and MediaBrowserService.

      @Override public void connect(com.android.media.IMediaController2 caller, java.lang.String callingPackage) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(callingPackage);
          boolean _status = mRemote.transact(Stub.TRANSACTION_connect, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().connect(caller, callingPackage);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void release(com.android.media.IMediaController2 caller) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_release, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().release(caller);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void setVolumeTo(com.android.media.IMediaController2 caller, int value, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeInt(value);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setVolumeTo, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setVolumeTo(caller, value, flags);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void adjustVolume(com.android.media.IMediaController2 caller, int direction, int flags) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeInt(direction);
          _data.writeInt(flags);
          boolean _status = mRemote.transact(Stub.TRANSACTION_adjustVolume, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().adjustVolume(caller, direction, flags);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      //////////////////////////////////////////////////////////////////////////////////////////////
      // send command
      //////////////////////////////////////////////////////////////////////////////////////////////

      @Override public void sendTransportControlCommand(com.android.media.IMediaController2 caller, int commandCode, android.os.Bundle args) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeInt(commandCode);
          if ((args!=null)) {
            _data.writeInt(1);
            args.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendTransportControlCommand, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sendTransportControlCommand(caller, commandCode, args);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void sendCustomCommand(com.android.media.IMediaController2 caller, android.os.Bundle command, android.os.Bundle args, android.os.ResultReceiver receiver) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendCustomCommand, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().sendCustomCommand(caller, command, args, receiver);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void prepareFromUri(com.android.media.IMediaController2 caller, android.net.Uri uri, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          if ((uri!=null)) {
            _data.writeInt(1);
            uri.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_prepareFromUri, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().prepareFromUri(caller, uri, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void prepareFromSearch(com.android.media.IMediaController2 caller, java.lang.String query, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(query);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_prepareFromSearch, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().prepareFromSearch(caller, query, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void prepareFromMediaId(com.android.media.IMediaController2 caller, java.lang.String mediaId, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(mediaId);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_prepareFromMediaId, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().prepareFromMediaId(caller, mediaId, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void playFromUri(com.android.media.IMediaController2 caller, android.net.Uri uri, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          if ((uri!=null)) {
            _data.writeInt(1);
            uri.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_playFromUri, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().playFromUri(caller, uri, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void playFromSearch(com.android.media.IMediaController2 caller, java.lang.String query, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(query);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_playFromSearch, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().playFromSearch(caller, query, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void playFromMediaId(com.android.media.IMediaController2 caller, java.lang.String mediaId, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(mediaId);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_playFromMediaId, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().playFromMediaId(caller, mediaId, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void setRating(com.android.media.IMediaController2 caller, java.lang.String mediaId, android.os.Bundle rating) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(mediaId);
          if ((rating!=null)) {
            _data.writeInt(1);
            rating.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setRating, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setRating(caller, mediaId, rating);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void setPlaylist(com.android.media.IMediaController2 caller, java.util.List<android.os.Bundle> playlist, android.os.Bundle metadata) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeTypedList(playlist);
          if ((metadata!=null)) {
            _data.writeInt(1);
            metadata.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPlaylist, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setPlaylist(caller, playlist, metadata);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void updatePlaylistMetadata(com.android.media.IMediaController2 caller, android.os.Bundle metadata) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          if ((metadata!=null)) {
            _data.writeInt(1);
            metadata.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_updatePlaylistMetadata, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().updatePlaylistMetadata(caller, metadata);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void addPlaylistItem(com.android.media.IMediaController2 caller, int index, android.os.Bundle mediaItem) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeInt(index);
          if ((mediaItem!=null)) {
            _data.writeInt(1);
            mediaItem.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_addPlaylistItem, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().addPlaylistItem(caller, index, mediaItem);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void removePlaylistItem(com.android.media.IMediaController2 caller, android.os.Bundle mediaItem) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          if ((mediaItem!=null)) {
            _data.writeInt(1);
            mediaItem.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_removePlaylistItem, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().removePlaylistItem(caller, mediaItem);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void replacePlaylistItem(com.android.media.IMediaController2 caller, int index, android.os.Bundle mediaItem) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeInt(index);
          if ((mediaItem!=null)) {
            _data.writeInt(1);
            mediaItem.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_replacePlaylistItem, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().replacePlaylistItem(caller, index, mediaItem);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void skipToPlaylistItem(com.android.media.IMediaController2 caller, android.os.Bundle mediaItem) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          if ((mediaItem!=null)) {
            _data.writeInt(1);
            mediaItem.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_skipToPlaylistItem, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().skipToPlaylistItem(caller, mediaItem);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void skipToPreviousItem(com.android.media.IMediaController2 caller) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_skipToPreviousItem, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().skipToPreviousItem(caller);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void skipToNextItem(com.android.media.IMediaController2 caller) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_skipToNextItem, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().skipToNextItem(caller);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void setRepeatMode(com.android.media.IMediaController2 caller, int repeatMode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeInt(repeatMode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setRepeatMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setRepeatMode(caller, repeatMode);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void setShuffleMode(com.android.media.IMediaController2 caller, int shuffleMode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeInt(shuffleMode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setShuffleMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setShuffleMode(caller, shuffleMode);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      //////////////////////////////////////////////////////////////////////////////////////////////
      // library service specific
      //////////////////////////////////////////////////////////////////////////////////////////////

      @Override public void getLibraryRoot(com.android.media.IMediaController2 caller, android.os.Bundle rootHints) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          if ((rootHints!=null)) {
            _data.writeInt(1);
            rootHints.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getLibraryRoot, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getLibraryRoot(caller, rootHints);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void getItem(com.android.media.IMediaController2 caller, java.lang.String mediaId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(mediaId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getItem, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getItem(caller, mediaId);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void getChildren(com.android.media.IMediaController2 caller, java.lang.String parentId, int page, int pageSize, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(parentId);
          _data.writeInt(page);
          _data.writeInt(pageSize);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getChildren, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getChildren(caller, parentId, page, pageSize, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void search(com.android.media.IMediaController2 caller, java.lang.String query, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(query);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_search, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().search(caller, query, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void getSearchResult(com.android.media.IMediaController2 caller, java.lang.String query, int page, int pageSize, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(query);
          _data.writeInt(page);
          _data.writeInt(pageSize);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSearchResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getSearchResult(caller, query, page, pageSize, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void subscribe(com.android.media.IMediaController2 caller, java.lang.String parentId, android.os.Bundle extras) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(parentId);
          if ((extras!=null)) {
            _data.writeInt(1);
            extras.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_subscribe, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().subscribe(caller, parentId, extras);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void unsubscribe(com.android.media.IMediaController2 caller, java.lang.String parentId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((caller!=null))?(caller.asBinder()):(null)));
          _data.writeString(parentId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unsubscribe, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().unsubscribe(caller, parentId);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static com.android.media.IMediaSession2 sDefaultImpl;
    }
    static final int TRANSACTION_connect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_release = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setVolumeTo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_adjustVolume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_sendTransportControlCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_sendCustomCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_prepareFromUri = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_prepareFromSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_prepareFromMediaId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_playFromUri = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_playFromSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_playFromMediaId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_setRating = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_setPlaylist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_updatePlaylistMetadata = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_addPlaylistItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_removePlaylistItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_replacePlaylistItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_skipToPlaylistItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_skipToPreviousItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_skipToNextItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_setRepeatMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_setShuffleMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_getLibraryRoot = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_getItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_getChildren = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_search = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_getSearchResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_subscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_unsubscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    public static boolean setDefaultImpl(com.android.media.IMediaSession2 impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.android.media.IMediaSession2 getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  // TODO(jaewan): add onCommand() to send private command
  // TODO(jaewan): (Post P) We may consider to add another binder just for the connection
  //               not to expose other methods to the controller whose connection wasn't accepted.
  //               But this would be enough for now because it's the same as existing
  //               MediaBrowser and MediaBrowserService.

  public void connect(com.android.media.IMediaController2 caller, java.lang.String callingPackage) throws android.os.RemoteException;
  public void release(com.android.media.IMediaController2 caller) throws android.os.RemoteException;
  public void setVolumeTo(com.android.media.IMediaController2 caller, int value, int flags) throws android.os.RemoteException;
  public void adjustVolume(com.android.media.IMediaController2 caller, int direction, int flags) throws android.os.RemoteException;
  //////////////////////////////////////////////////////////////////////////////////////////////
  // send command
  //////////////////////////////////////////////////////////////////////////////////////////////

  public void sendTransportControlCommand(com.android.media.IMediaController2 caller, int commandCode, android.os.Bundle args) throws android.os.RemoteException;
  public void sendCustomCommand(com.android.media.IMediaController2 caller, android.os.Bundle command, android.os.Bundle args, android.os.ResultReceiver receiver) throws android.os.RemoteException;
  public void prepareFromUri(com.android.media.IMediaController2 caller, android.net.Uri uri, android.os.Bundle extras) throws android.os.RemoteException;
  public void prepareFromSearch(com.android.media.IMediaController2 caller, java.lang.String query, android.os.Bundle extras) throws android.os.RemoteException;
  public void prepareFromMediaId(com.android.media.IMediaController2 caller, java.lang.String mediaId, android.os.Bundle extras) throws android.os.RemoteException;
  public void playFromUri(com.android.media.IMediaController2 caller, android.net.Uri uri, android.os.Bundle extras) throws android.os.RemoteException;
  public void playFromSearch(com.android.media.IMediaController2 caller, java.lang.String query, android.os.Bundle extras) throws android.os.RemoteException;
  public void playFromMediaId(com.android.media.IMediaController2 caller, java.lang.String mediaId, android.os.Bundle extras) throws android.os.RemoteException;
  public void setRating(com.android.media.IMediaController2 caller, java.lang.String mediaId, android.os.Bundle rating) throws android.os.RemoteException;
  public void setPlaylist(com.android.media.IMediaController2 caller, java.util.List<android.os.Bundle> playlist, android.os.Bundle metadata) throws android.os.RemoteException;
  public void updatePlaylistMetadata(com.android.media.IMediaController2 caller, android.os.Bundle metadata) throws android.os.RemoteException;
  public void addPlaylistItem(com.android.media.IMediaController2 caller, int index, android.os.Bundle mediaItem) throws android.os.RemoteException;
  public void removePlaylistItem(com.android.media.IMediaController2 caller, android.os.Bundle mediaItem) throws android.os.RemoteException;
  public void replacePlaylistItem(com.android.media.IMediaController2 caller, int index, android.os.Bundle mediaItem) throws android.os.RemoteException;
  public void skipToPlaylistItem(com.android.media.IMediaController2 caller, android.os.Bundle mediaItem) throws android.os.RemoteException;
  public void skipToPreviousItem(com.android.media.IMediaController2 caller) throws android.os.RemoteException;
  public void skipToNextItem(com.android.media.IMediaController2 caller) throws android.os.RemoteException;
  public void setRepeatMode(com.android.media.IMediaController2 caller, int repeatMode) throws android.os.RemoteException;
  public void setShuffleMode(com.android.media.IMediaController2 caller, int shuffleMode) throws android.os.RemoteException;
  //////////////////////////////////////////////////////////////////////////////////////////////
  // library service specific
  //////////////////////////////////////////////////////////////////////////////////////////////

  public void getLibraryRoot(com.android.media.IMediaController2 caller, android.os.Bundle rootHints) throws android.os.RemoteException;
  public void getItem(com.android.media.IMediaController2 caller, java.lang.String mediaId) throws android.os.RemoteException;
  public void getChildren(com.android.media.IMediaController2 caller, java.lang.String parentId, int page, int pageSize, android.os.Bundle extras) throws android.os.RemoteException;
  public void search(com.android.media.IMediaController2 caller, java.lang.String query, android.os.Bundle extras) throws android.os.RemoteException;
  public void getSearchResult(com.android.media.IMediaController2 caller, java.lang.String query, int page, int pageSize, android.os.Bundle extras) throws android.os.RemoteException;
  public void subscribe(com.android.media.IMediaController2 caller, java.lang.String parentId, android.os.Bundle extras) throws android.os.RemoteException;
  public void unsubscribe(com.android.media.IMediaController2 caller, java.lang.String parentId) throws android.os.RemoteException;
}
