package org.me.gcu.equakestartercode;

public class WidgetClass
{
    private String title;
    private String link;
    private String description;
    private String language;
    private String lastBuildDate;

    public WidgetClass()
    {
        title = "";
        link = "";
        description = "";
        language = "";
        lastBuildDate = "";
    }

    public WidgetClass(String atitle,String alink,String adescription, String alanguage, String alastBuildDate)
    {
        title = atitle;
        link = alink;
        description = adescription;
        language = alanguage;
        lastBuildDate = alastBuildDate;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String atitle)
    {
        title = atitle;
    }

    public String getLink()
    {
        return link;
    }

    public void setLink(String alink)
    {
        link = alink;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String adescription) { description = adescription; }

    public String getLanguage() { return language; }

    public void setLanguage(String alanguage)
    {
        language = alanguage;
    }

    public String getLastBuildDate() { return lastBuildDate; }

    public void setLastBuildDate(String alastBuildDate)
    {
        lastBuildDate = alastBuildDate;
    }


    public String toString()
    {
        String temp;

        temp = title + " " + link + " " + description + "" + language + "" + lastBuildDate;

        return temp;
    }

} // End of class
