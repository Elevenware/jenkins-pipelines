#!groovy

@Library('commands') import com.elevenware.jenkins.pipelines.Pipeline

def pipeline = new Pipeline()
stage(name: 'int') {
  pipeline.run(this)
}

tracer {
    bat "cmd /?"
}