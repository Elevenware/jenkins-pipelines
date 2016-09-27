['integration', 'qa', 'staging', 'prod'].each { env ->
 
  stage name: env, concurrency: 1
    node {
      echo "Running $env"
      input message: "Does http://localhost:8888/$env/ look good?"
    }
}