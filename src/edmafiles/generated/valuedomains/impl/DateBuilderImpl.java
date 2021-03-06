package edmafiles.generated.valuedomains.impl;

import edmafiles.generated.valuedomains.Date;
import edmafiles.generated.valuedomains.Date.DateBuilderDay;
import edmafiles.generated.valuedomains.Date.DateBuilderMonth;
import edmafiles.generated.valuedomains.Date.DateBuilderYear;
import edmafiles.generated.valuedomains.DayOfMonth;
import edmafiles.generated.valuedomains.Month;
import edmafiles.generated.valuedomains.Year;
import edmafiles.generated.valuedomains.impl.DayOfMonthImpl;
import edmafiles.generated.valuedomains.impl.MonthImpl;
import edmafiles.generated.valuedomains.impl.YearImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class DateBuilderImpl implements DateBuilderDay, DateBuilderMonth, DateBuilderYear
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public DateBuilderImpl()
    {
        edma_value = new Object[3];
    }

    /**
     * sets the year field.
     * @param year  The value to assign to the year field
     * @return      Builder interface for setting the month field
     */
    public DateBuilderMonth year(Year year)
    {
        if(year == null) throw new NullPointerException("The field year in the Date ValueDomain may not be null");
        edma_value[0] = ((IValueInstance) year).edma_getValue();
        return this;
    }

    /**
     * sets the year field.
     * @param year  The value to assign to the year field
     * @return      Builder interface for setting the month field
     */
    public DateBuilderMonth year(Integer year) throws InvalidValueException
    {
        if(year != null) YearImpl.edma_validate(year);
        if(year == null) throw new NullPointerException("The field year in the Date ValueDomain may not be null");
        edma_value[0] = YearImpl.edma_create(year);
        return this;
    }

    /**
     * sets the month field.
     * @param month  The value to assign to the month field
     * @return       Builder interface for setting the day field
     */
    public DateBuilderDay month(Month month)
    {
        if(month == null) throw new NullPointerException("The field month in the Date ValueDomain may not be null");
        edma_value[1] = ((IValueInstance) month).edma_getValue();
        return this;
    }

    /**
     * sets the month field.
     * @param month  The value to assign to the month field
     * @return       Builder interface for setting the day field
     */
    public DateBuilderDay month(Integer month) throws InvalidValueException
    {
        if(month != null) MonthImpl.edma_validate(month);
        if(month == null) throw new NullPointerException("The field month in the Date ValueDomain may not be null");
        edma_value[1] = MonthImpl.edma_create(month);
        return this;
    }

    /**
     * sets the day field.
     * @param day  The value to assign to the day field
     * @return     The created Date value
     */
    public Date day(DayOfMonth day) throws InvalidValueException
    {
        if(day == null) throw new NullPointerException("The field day in the Date ValueDomain may not be null");
        edma_value[2] = ((IValueInstance) day).edma_getValue();
        DateImpl.edma_validate(edma_value);
        return new DateImpl(DateImpl.edma_create(edma_value));
    }

    /**
     * sets the day field.
     * @param day  The value to assign to the day field
     * @return     The created Date value
     */
    public Date day(Integer day) throws InvalidValueException
    {
        if(day != null) DayOfMonthImpl.edma_validate(day);
        if(day == null) throw new NullPointerException("The field day in the Date ValueDomain may not be null");
        edma_value[2] = DayOfMonthImpl.edma_create(day);
        DateImpl.edma_validate(edma_value);
        return new DateImpl(DateImpl.edma_create(edma_value));
    }
}
