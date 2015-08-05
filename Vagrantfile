# -*- mode: ruby -*-
# vi: set ft=ruby :

# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION ||= "2"
Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "ubuntu/vivid64"
  config.vm.network "forwarded_port", guest: 5001, host: 5001 
  config.ssh.forward_agent = true
  config.vm.provider "virtualbox" do |v|
    v.memory = 3072
  end

  config.vm.network "private_network", type: "dhcp"
  config.vm.synced_folder ".", "/vagrant", type: "nfs"
  config.vm.provision "shell", path: "script/vagrant/provision"
  config.vm.provision "shell", path: "script/vagrant/user-provision", privileged: false
end
