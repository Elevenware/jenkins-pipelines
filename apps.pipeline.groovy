class Environment implements Serializable {

  String name
  boolean autopromote

  Environment(String name, boolean autopromote = true) {
    this.name = name
    this.autopromote = autopromote
  }

}

def envs = [
  new Environment('integration'),
  new Environment('qa', false),
  new Environment('staging', false),
  new Environment('production', true)
]

for(int i = 0; i < envs.size(); i++) {

  Environment env = envs[i]
  stage(name: env.name, concurrency: 1) 
    node {
      
      if(!env.autopromote) {
        String last = envs.get(i - 1).name
        input message: "Does http://localhost:8888/$last/ look good?"
      }
      echo "Running $env"
    }
      
  
}