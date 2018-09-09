
package com.oracle.xmlns.apps.financials.generalledger.accounts.codecombinations.publicflex.account;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.financials.generalledger.accounts.codecombinations.publicflex.account package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Account_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "account");
    private final static QName _AccountFNDACFFConcatenatedStorage_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "FND_ACFF_ConcatenatedStorage");
    private final static QName _AccountEndDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "EndDateActive");
    private final static QName _AccountFNDACFFDelimiter_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "FND_ACFF_Delimiter");
    private final static QName _AccountStartDateActive_QNAME = new QName("http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", "StartDateActive");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.financials.generalledger.accounts.codecombinations.publicflex.account
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "FND_ACFF_ConcatenatedStorage", scope = Account.class)
    public JAXBElement<String> createAccountFNDACFFConcatenatedStorage(String value) {
        return new JAXBElement<String>(_AccountFNDACFFConcatenatedStorage_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "EndDateActive", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountEndDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountEndDateActive_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "FND_ACFF_Delimiter", scope = Account.class)
    public JAXBElement<String> createAccountFNDACFFDelimiter(String value) {
        return new JAXBElement<String>(_AccountFNDACFFDelimiter_QNAME, String.class, Account.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/financials/generalLedger/accounts/codeCombinations/publicFlex/Account/", name = "StartDateActive", scope = Account.class)
    public JAXBElement<XMLGregorianCalendar> createAccountStartDateActive(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AccountStartDateActive_QNAME, XMLGregorianCalendar.class, Account.class, value);
    }

}
