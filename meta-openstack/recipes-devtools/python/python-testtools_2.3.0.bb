DESCRIPTION = "Extensions to the Python standard library unit testing framework"
HOMEPAGE = "https://pypi.python.org/pypi/testtools/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e2c9d3e8ba7141c83bfef190e0b9379a"

SRC_URI[md5sum] = "0f0feb915497816cb99e39437494217e"
SRC_URI[sha256sum] = "5827ec6cf8233e0f29f51025addd713ca010061204fdea77484a2934690a0559"

inherit setuptools pypi
DEPENDS += " \
    python-pbr \
    "

# Satisfy setup.py 'setup_requires'
DEPENDS += " \
    python-pbr-native \
    "

RDEPENDS_${PN} += "\
    python-extras \
    python-pbr \
    "
