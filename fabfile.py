import os
from fabvenv import virtualenv
from fabric.api import env, run, cd, settings, local, shell_env

machine_ip = "119.254.108.142"
password = "521strong"
user_at_machine = "unionx@{0}".format(machine_ip)

env.hosts = [user_at_machine]
env.passwords = {user_at_machine: password}

code_dir = "/home/unionx/genisland"


def update():
    with cd(code_dir):
        with settings(warn_only=True):
            run("git pull origin master")
            # with shell_env(PATH="/home/unionx/.nvm/v0.10.25/bin:$PATH"):
            # run("npm install")
            run("lein deps")
            run("bower install")
