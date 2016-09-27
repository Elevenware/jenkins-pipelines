def envs = ['integration', 'qa', 'staging', 'prod']

for(int i = 0; i < envs.size(); i++) {

  String env = envs[i]
  stage(name: env, concurrency: 1) 
    node {
      echo "Running $env"
      if(i > 1) {
        String last = envs.get(i - 1)
        input message: "Does http://localhost:8888/$last/ look good?"
      }
    }
      
  
}