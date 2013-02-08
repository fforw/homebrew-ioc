package de.fforw.homebrewioc;

/**
 * Immutable example domain class. 
 *  
 * @author fforw
 *
 */
public class Foo
{
    public final String name;

    public final String value;
    
    public Foo(String name, String value)
    {
        this.name = name;
        this.value = value;
    }
    
    public Foo withNewValue(String value)
    {
        return new Foo(this.name, value);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + ": name = " + this.name + ", value = " + value;
    }
}
