FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

PR := "${PR}.1"

SRC_URI += " \
       file://up-board-user-config.cfg \
"
# replace these SRCREVs with the real commit ids once you've had
# the appropriate changes committed to the upstream linux-yocto repo
# SRCREV_machine_pn-linux-yocto_up-board ?= "${AUTOREV}"
# SRCREV_meta_pn-linux-yocto_up-board ?= "${AUTOREV}"

