package org.zstack.header.vm

doc {
    title "DeleteVmSshKey"

    category "vmInstance"

    desc "在这里填写API描述"

    rest {
        request {
            url "DELETE /v1/vm-instances/{uuid}/ssh-keys"


            header(OAuth: 'the-session-uuid')

            clz APIDeleteVmSshKeyMsg.class

            desc ""

            params {

                column {
                    name "uuid"
                    enclosedIn ""
                    desc "资源的UUID，唯一标示该资源"
                    location "url"
                    type "String"
                    optional true
                    since "0.6"

                }
                column {
                    name "systemTags"
                    enclosedIn ""
                    desc "系统标签"
                    location "body"
                    type "List"
                    optional true
                    since "0.6"

                }
                column {
                    name "userTags"
                    enclosedIn ""
                    desc "用户标签"
                    location "body"
                    type "List"
                    optional true
                    since "0.6"

                }
            }
        }

        response {
            clz APIDeleteVmSshKeyEvent.class
        }
    }
}