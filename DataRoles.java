import java.util.ArrayList;
import java.util.Arrays;

public class DataRoles {
	public static void main(String[] args) {
        EngineerRoles EngRole = new EngineerRoles();
        ResearcherRoles ResRole = new ResearcherRoles();

        EngRole.setRole("Data Oops");
        EngRole.getRole();
        EngRole.displayRoleDesc();

        ResRole.setRole("Data Engineer");
        ResRole.getRole();
        ResRole.displayRoleDesc();

        EngRole.setRole("Machine Learning Engineer");
        EngRole.getRole();
        EngRole.displayRoleDesc();

        EngineerTools EngTools = new EngineerTools();
        EngTools.removeDataOpsTools();
        EngTools.displayDataOpsTools();
    }
}

class EngineerRoles {
    String EngRole = null;
    
    void setRole(String EngRole) {
        this.EngRole = EngRole;
    }

    String getRole() {
        return this.EngRole; 
    }

	void displayRoleDesc() {
        switch (EngRole) {
            case "Data Engineer":
              System.out.println("Their core function is in the ingestion, structuring and standardization and processing of data. Their role has evolved quite a lot over the past few years and now involves dealing with both analytical and production systems.");
              break;
            case "Machine Learning Engineer":
              System.out.println("They are a very specialized type of backend software engineer focusing on leveraging data. They operationlize and put predictive models into production, building pipelines, api and training models.");
              break;
            case "Product Analyst":
              System.out.println("Product Analyst help define the strategic direction for product development by pushing for data driven decision making. They are in charge of estimating the potential impact of the product components, analysing user behaviour data, working for the engineering team to setup and analyze A/B tests, setup goals and tracking the performance against these goals. Their toolset mainly consists of SQL and Dashboarding tools, but may involve more advanced technologies or leveraging tools such as google analytics.");
              break;
            case "Data Product Owner":
              System.out.println("Data Product Owner help organize the overall direction of products leveraging data. They help define the different requirements, own the product roadmap, liaise with stakeholders as well as tackle some project management tasks, such coordinating the acquisition of the necessary training data for a Machine Learning project.");
              break;
            case "Data Vizualization Engineer":
              System.out.println("Data Vizualization Engineer make data looks beautiful. They typically work as part of a product team setting up dashboard within applications. They typically leverage Javascript for this purpose, using libraries such as D3js, VisGL and leafletJS.");
              break;
            case "Data Ops":
              System.out.println("Data Ops help setup the data infrastructure, help handle code deployment, setup data quality checks and alerting & monitoring for the different flows.");
              break;
            default:
            	try{
              assert false: EngRole + " is invalid engineer role";
            	}catch(AssertionError e) {
            		System.out.println(e.getMessage());
            	}
        }
	}
}

class ResearcherRoles {
    String ResRole = null;
    
    void setRole(String ResRole) {
        this.ResRole = ResRole;
    }

    String getRole() {
        return this.ResRole; 
    }

	void displayRoleDesc() {
        switch (ResRole) {
            case "Research Scientist":
              System.out.println("Research Scientist deep dives complicated problems, which may or may not have a direct business outcome. Think of them as sowing the seed to what will become future products. Think of image classification before it became mainstream and implemented in products, or people working on testing new deep neural network architectures.");
              break;
            case "Statistician":
              System.out.println("Statisticians can help answer more complex questions with statistical rigour. This is the case in biostatistics where statisticians can help in designing and analyzing clinical trials and help provide the regulatory submissions.");
              break;
            case "Economist":
              System.out.println("Economists work on leveraging data and economic theory for the good of companies. That can involve designing auction systems for ads, or working on predicting economic trends for risk assessment and capital allocation.");
              break;
            default:
            	try {
              assert false: ResRole + " is invalid research role";
            	}catch(AssertionError e) {
            		System.out.println(e.getMessage());
            	}
        }
	}
}

class EngineerTools {
    ArrayList<String> EngTools;
    ArrayList<String> DataOpsTools;

    EngineerTools() {
        this.EngTools = new ArrayList<>(Arrays.asList(
                                            "Docker", "Kubernetes", "OpenShift", 
                                            "Tableau", "MongoDB", "ElasticSearch", 
                                            "Spark", "TensorFlow", "PyTorch"
                                            )
                                        );
        this.DataOpsTools = new ArrayList<>(Arrays.asList("Docker", "Kubernetes", "OpenShift"));
        // this.DataOpsTools = new ArrayList<>(Arrays.asList("Pandas"));
    }

    void removeDataOpsTools() {
    	try {
        assert this.EngTools.removeAll(this.DataOpsTools): "Failed to remove!";
    	}catch(AssertionError e){
    	System.out.println(e.getMessage());
    	}
    }

    void displayDataOpsTools() {
      System.out.println(Arrays.toString(this.EngTools.toArray()));
    }
}