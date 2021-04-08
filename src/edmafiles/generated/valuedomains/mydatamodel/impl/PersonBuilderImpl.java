package edmafiles.generated.valuedomains.mydatamodel.impl;

import edmafiles.generated.valuedomains.Email;
import edmafiles.generated.valuedomains.Name;
import edmafiles.generated.valuedomains.impl.EmailImpl;
import edmafiles.generated.valuedomains.impl.NameImpl;
import edmafiles.generated.valuedomains.mydatamodel.Person;
import edmafiles.generated.valuedomains.mydatamodel.Person.PersonBuilderEmail;
import edmafiles.generated.valuedomains.mydatamodel.Person.PersonBuilderFirstName;
import edmafiles.generated.valuedomains.mydatamodel.Person.PersonBuilderID;
import edmafiles.generated.valuedomains.mydatamodel.Person.PersonBuilderLastName;
import edmafiles.generated.valuedomains.mydatamodel.PersonID;
import edmafiles.generated.valuedomains.mydatamodel.impl.PersonIDImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class PersonBuilderImpl implements PersonBuilderEmail, PersonBuilderFirstName, PersonBuilderID, PersonBuilderLastName
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public PersonBuilderImpl()
    {
        edma_value = new Object[4];
    }

    /**
     * sets the ID field.
     * @param ID  The value to assign to the ID field
     * @return    Builder interface for setting the firstName field
     */
    public PersonBuilderFirstName ID(PersonID ID)
    {
        edma_value[0] = (ID == null ? null : (((IValueInstance) ID).edma_getValue()));
        return this;
    }

    /**
     * sets the ID field.
     * @param ID  The value to assign to the ID field
     * @return    Builder interface for setting the firstName field
     */
    public PersonBuilderFirstName ID(Long ID) throws InvalidValueException
    {
        if(ID != null) PersonIDImpl.edma_validate(ID);
        edma_value[0] = (ID == null ? null : (PersonIDImpl.edma_create(ID)));
        return this;
    }

    /**
     * sets the fieldID to null.
     * @return  Builder interface for setting the firstName field
     */
    public PersonBuilderFirstName noID()
    {
        edma_value[0] = null;
        return this;
    }

    /**
     * sets the firstName field.
     * @param firstName  The value to assign to the firstName field
     * @return           Builder interface for setting the lastName field
     */
    public PersonBuilderLastName firstName(Name firstName)
    {
        if(firstName == null) throw new NullPointerException("The field firstName in the Person ValueDomain may not be null");
        edma_value[1] = ((IValueInstance) firstName).edma_getValue();
        return this;
    }

    /**
     * sets the firstName field.
     * @param firstName  The value to assign to the firstName field
     * @return           Builder interface for setting the lastName field
     */
    public PersonBuilderLastName firstName(String firstName) throws InvalidValueException
    {
        if(firstName != null) NameImpl.edma_validate(firstName);
        if(firstName == null) throw new NullPointerException("The field firstName in the Person ValueDomain may not be null");
        edma_value[1] = NameImpl.edma_create(firstName);
        return this;
    }

    /**
     * sets the lastName field.
     * @param lastName  The value to assign to the lastName field
     * @return          Builder interface for setting the email field
     */
    public PersonBuilderEmail lastName(Name lastName)
    {
        if(lastName == null) throw new NullPointerException("The field lastName in the Person ValueDomain may not be null");
        edma_value[2] = ((IValueInstance) lastName).edma_getValue();
        return this;
    }

    /**
     * sets the lastName field.
     * @param lastName  The value to assign to the lastName field
     * @return          Builder interface for setting the email field
     */
    public PersonBuilderEmail lastName(String lastName) throws InvalidValueException
    {
        if(lastName != null) NameImpl.edma_validate(lastName);
        if(lastName == null) throw new NullPointerException("The field lastName in the Person ValueDomain may not be null");
        edma_value[2] = NameImpl.edma_create(lastName);
        return this;
    }

    /**
     * sets the email field.
     * @param email  The value to assign to the email field
     * @return       The created Person value
     */
    public Person email(Email email)
    {
        if(email == null) throw new NullPointerException("The field email in the Person ValueDomain may not be null");
        edma_value[3] = ((IValueInstance) email).edma_getValue();
        return new PersonImpl(PersonImpl.edma_create(edma_value));
    }

    /**
     * sets the email field.
     * @param email  The value to assign to the email field
     * @return       The created Person value
     */
    public Person email(String email) throws InvalidValueException
    {
        if(email != null) EmailImpl.edma_validate(email);
        if(email == null) throw new NullPointerException("The field email in the Person ValueDomain may not be null");
        edma_value[3] = EmailImpl.edma_create(email);
        return new PersonImpl(PersonImpl.edma_create(edma_value));
    }
}
