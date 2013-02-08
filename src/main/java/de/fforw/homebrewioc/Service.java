package de.fforw.homebrewioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service layer example 
 * @author fforw
 *
 */
public class Service
{
    private static Logger log = LoggerFactory.getLogger(Service.class);
    
    private DBAccess db;

    public Service(DBAccess db)
    {
        this.db = db;
    }
    
    /**
     * "Frobnitzes" the foo. "frobnitzen" would be an example of a "business process".
     * @param id
     * 
     */
    public void frobnitzFoo(String id)
    {
        log.debug("New transaction");
        
        Foo foo = db.getFoo("test");
        db.writeFoo(foo.withNewValue("My new value")); 

        log.debug("Close transaction");
    }
}
