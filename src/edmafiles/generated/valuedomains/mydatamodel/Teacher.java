package edmafiles.generated.valuedomains.mydatamodel;

import edmafiles.generated.learnemda;
import edmafiles.generated.valuedomains.external.EDMA_ExternalConstraints;
import edmafiles.generated.valuedomains.mydatamodel.TeacherID;
import edmafiles.generated.valuedomains.mydatamodel.impl.TeacherBuilderImpl;
import edmafiles.generated.valuedomains.mydatamodel.impl.TeacherImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Teacher
 */
public abstract class Teacher implements Comparable<Teacher>
{
    protected static final IMetaValueDomain edma_domain = learnemda.environment.getValueDomainDefinitions().getValueDomain(26);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Teacher from the terminal
     */
    public static Teacher fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new TeacherImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Teacher from the string representation
     */
    public static Teacher fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new TeacherImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Teacher read from the stream
     */
    public static Teacher fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new TeacherImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Teacher read from the stream
     */
    public static Teacher fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new TeacherImpl(res);
    }

    /**
     * Starts creation of a new Teacher
     * @return  Builder interface to set the ID field
     */
    public static TeacherBuilderID create()
    {
        return new TeacherBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field ID
     * @return  The value of the field ID
     */
    public abstract TeacherID ID();


    /**
     * Builder interface for setting the ID field of Teacher
     */
    public interface TeacherBuilderID
    {

        /**
         * sets the ID field.
         * @param ID  The value to assign to the ID field
         * @return    The created Teacher value
         */
        public Teacher ID(TeacherID ID);

        /**
         * sets the ID field.
         * @param ID  The value to assign to the ID field
         * @return    The created Teacher value
         */
        public Teacher ID(Long ID) throws InvalidValueException;

        /**
         * sets the fieldID to null.
         * @return  The created Teacher value
         */
        public Teacher noID();

    }

}
