def call(){
  dependencyCheck additionalArguments: '--scan ./ --disableKnownExploited --format XML', odcInstallation: 'OWASP'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
