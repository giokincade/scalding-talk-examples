# -*- mode: ruby -*-
# vi: set ft=ruby :

# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION ||= "2"
Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "http://cloud-images.ubuntu.com/vagrant/saucy/current/saucy-server-cloudimg-amd64-vagrant-disk1.box"
  config.vm.network "forwarded_port", guest: 5000, host: 5000 
  config.ssh.forward_agent = true

  config.vm.network "private_network", type: "dhcp"
  config.vm.synced_folder ".", "/vagrant", type: "nfs"
  config.vm.provision "shell", path: "script/vagrant/provision"
  config.vm.provision "shell", path: "script/vagrant/user-provision", privileged: false
end
