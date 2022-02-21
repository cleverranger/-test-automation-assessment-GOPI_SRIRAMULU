package core;

public class Config {

    private String baseURL;
    private long timeout;

    public String getURL(){
        return baseURL;
    }

    public void setBaseURL(final String baseURL){
        this.baseURL = baseURL;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }
}
