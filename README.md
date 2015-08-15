# Booting the VM
If you don't have scala/sbt and don't want to install it on your local machine, you can use a Vagrant VM that's configured in this repo.  

You will need to download and install [vagrant](https://www.vagrantup.com/downloads.html) and a vm provider.  I  use [VirtualBox](https://www.virtualbox.org/wiki/Downloads). It's free and works reasonably well. 

To boot up the VM, run this inside the repo:
```
vagrant up
```
This will download the VM image the first time it's run, so that might take a little while.

To SSH into the VM
```
vagrant ssh
```

You will find this repository at ~/development/host-repo

To stop the VM
```
vagrant halt
```

To destroy the VM (it's state and configuration is stored on disk):
```
vagrant destroy
```

# Running the Jobs
First, start sbt:

```
./script/sbt
```

To run the fields-api example:

```
runMain com.giokincade.scalding.Runner com.giokincade.scalding.ExampleJob --local
```

To run the typed-pipe example:

```
runMain com.giokincade.scalding.Runner com.giokincade.scalding.TypedPipeExampleJob -local
```
