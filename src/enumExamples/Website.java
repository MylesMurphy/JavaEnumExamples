package enumExamples;

public enum Website {

	MYWEBSITE("www.mylesvmurphy.com");
	
    private String url;

    Website(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
	
	
}
