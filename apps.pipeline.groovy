stage name: 'integration', concurrency: 1
  node {
     echo 'This is inegration'
     input message: "Does http://localhost:8888/integration/ look good?"
  }
stage name: 'QA', concurrency: 1
  node {
     echo 'This is QA'
  }
stage name: 'staging', concurrency: 1
  node {
     echo 'This is staging'
     input message: "Does http://localhost:8888/qa/ look good?"
  }
stage name: 'production', concurrency: 1
  node {
     echo 'This is production'
  }