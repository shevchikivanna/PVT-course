package Lesson26.Hometask26;

public class Countrie
{
    private int id;
    private String code;
    private String name;
    private String description;
      
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
  
    @Override
    public String toString()
    {
        return "Country:: ID=" + this.id + " Code=" + this.code + " Name=" + this.name + " Description=" + this.description;
                
    }

}
