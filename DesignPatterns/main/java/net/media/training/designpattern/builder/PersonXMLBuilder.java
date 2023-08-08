package net.media.training.designpattern.builder;

public class PersonXMLBuilder {
    private Person person;
    private String personXml = "";

    PersonXMLBuilder(Person person) {
        this.person = person;
    }

    public PersonXMLBuilder appendPersonalDetail() {
        this.personXml += "<Person id=\"" + this.person.getId() + "\" name=\"" + this.person.getName() + "\">";
        return this;
    }

    public PersonXMLBuilder appendAddress() {
        this.personXml += "<Address><City>\"" + this.person.getCity() + "\"</City>" + "<Country>" + this.person.getCountry() + "</Country></Address>";
        return this;
    }

    public String buildXML() {
        return personXml + "</Person>";
    }
}
