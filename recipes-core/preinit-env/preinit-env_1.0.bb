SUMMARY = "Helper init script to workaround systemd"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
SRC_URI = "file://${BPN}.sh"
RDEPENDS_${PN} += "busybox"

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"
do_install() {
	install -m 0755 -d ${D}${base_sbindir}
	install -m 0755 ${UNPACKDIR}/${BPN}.sh ${D}/${base_sbindir}/${BPN}
}

inherit allarch

FILES_${PN} += "${base_sbindir}"
