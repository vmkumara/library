
def newdownload(repo)
{
      git "https://github.com/intelliqittrainings/${repo}"
}

def newbuild()
{
      sh 'mvn package'
}


