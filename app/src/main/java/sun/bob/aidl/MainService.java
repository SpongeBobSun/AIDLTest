package sun.bob.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class MainService extends Service {
    private int id;
    private String name;
    private Data data;
    public MainService() {
        id = 22333;
        name = "GTA";
        data = new Data();
        data.setData("Snoop Dogg");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return mBinder;
    }

    private ServiceAIDL.Stub mBinder = new ServiceAIDL.Stub(){

        @Override
        public int getId() throws RemoteException {
            return id;
        }

        @Override
        public String getServiceName() throws RemoteException {
            return name;
        }

        @Override
        public void play() throws RemoteException {
            Log.e("Service:","WTF?");
        }

        @Override
        public Data getData() throws RemoteException {
            return data;
        }
    };
}
