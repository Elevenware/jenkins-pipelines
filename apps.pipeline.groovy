stage name: 'integration', concurrency: 1
  node {
     echo 'This is inegration'
  }
stage name: 'QA', concurrency: 1
  node {
     echo 'This is QA'
  }
stage name: 'staging', concurrency: 1
  node {
     echo 'This is staging'
  }
stage name: 'production', concurrency: 1
  node {
     echo 'This is production'
  }