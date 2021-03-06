DESCRIPTION = "Cryptography demo descriptions for Matrix v2"
HOMEPAGE = "https://gitorious.org/matrix-gui-v2/matrix-gui-v2-apps"

require matrix-gui-apps-git.inc

PR = "${INC_PR}.11"

PACKAGE_ARCH = "${MACHINE_ARCH}"

S = "${WORKDIR}/git/cryptos_apps_scripts"
S_ti33x = "${WORKDIR}/git/cryptos_apps_program"
S_ti43x = "${WORKDIR}/git/cryptos_apps_program"
S_dra7xx = "${WORKDIR}/git/cryptos_apps_program"
S_keystone = "${WORKDIR}/git/cryptos_apps_program"

FILES_${PN} += "${MATRIX_BASE_DIR}/*"

# Make sure crypto submenu and app images has been installed. Also make sure openssl is available
RDEPENDS_${PN} += "matrix-gui-apps-images matrix-gui-submenus-cryptos openssl matrix-gui-helper-scripts"

RDEPENDS_${PN}_append_ti33x = " ti-crypto-examples"
RDEPENDS_${PN}_append_ti43x = " ti-crypto-examples"
RDEPENDS_${PN}_append_dra7xx = " ti-crypto-examples"
RDEPENDS_${PN}_append_keystone = " ti-crypto-examples"
