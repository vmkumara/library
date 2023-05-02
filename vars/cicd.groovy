
def newdownload(repo)
{
      git "https://github.com/intelliqittrainings/${repo}"
}

def newbuild(repo)
{
      sh 'mvn package'
}


