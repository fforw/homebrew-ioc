package de.fforw.homebrewioc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBAccess
{
    private static Logger log = LoggerFactory.getLogger(DBAccess.class);
    
    private String url;
    private String name;
    private String pw;

    public DBAccess(String url, String name, String pw)
    {
        this.url = url;
        this.name = name;
        this.pw = pw;
    }
    
    public Foo getFoo(String id)
    {
        op("\"Reading\" foo '" + id + "'");
        
        return new Foo(id, "Test content.");
    }

    public void writeFoo(Foo foo)
    {
        op("Not actually writing " + foo);
    }
    
    private void op(String op)
    {
        log.debug( op + " ( url = " + url + " authenticated as " + name + ")");
    }

}
