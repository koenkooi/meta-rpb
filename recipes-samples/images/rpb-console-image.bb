SUMMARY = "Basic console image"

IMAGE_FEATURES += "splash package-management ssh-server-dropbear hwcodecs"

LICENSE = "MIT"

inherit core-image distro_features_check extrausers

# let's make sure we have a good image..
REQUIRED_DISTRO_FEATURES = "pam systemd"

CORE_IMAGE_BASE_INSTALL += " \
    coreutils gptfdisk kernel-modules connman 96boards-tools \
"

EXTRA_USERS_PARAMS = "\
useradd -p '' linaro; \
"
