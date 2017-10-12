package statepattern.solution;


public interface TCPConnectionState {

    void open();

    void close();

    void acknowledge() throws Exception;


}
