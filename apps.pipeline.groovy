def envs = ['integration', 'qa', 'staging', 'prod']

for(String env: envs) {

  stage name: env, concurrency: 1
    node {
      echo "Running $env"
      input message: "Does http://localhost:8888/$env/ look good?"
    }
}