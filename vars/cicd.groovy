
def newdownload(repo)
{
      git "https://github.com/intelliqittrainings/${repo}"
}

def newbuild()
{
      sh 'mvn package'
}

def newdeployment("jobname","ip","appname")
{
      sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}


