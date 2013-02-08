package de.fforw.homebrewioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application
{
    private static Logger log = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args)
    {
        log.debug("startup");
        
        DBAccess db = new DBAccess("database.url", "fforw", "secre7");
        Service svc = new Service(db);
        
        // now we are done configuring our app
        // we now do actual work
        log.debug("All set up");

        svc.frobnitzFoo("test");
        
        // .. and we're out. We could of course just replace this class
        // with a servlet or controller or whatever to change from the
        // do-once-and-exit model
        
        log.debug("Exit application");
    }
}
