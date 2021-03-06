package org.zstack.header.vm

doc {
    title "AttachL3NetworkToVm"

    category "vmInstance"

    desc "在这里填写API描述"

    rest {
        request {
            url "POST /v1/vm-instances/{vmInstanceUuid}/l3-networks/{l3NetworkUuid}"


            header(OAuth: 'the-session-uuid')

            clz APIAttachL3NetworkToVmMsg.class

            desc ""

            params {

                column {
                    name "vmInstanceUuid"
                    enclosedIn "params"
                    desc "云主机UUID"
                    location "url"
                    type "String"
                    optional false
                    since "0.6"

                }
                column {
                    name "l3NetworkUuid"
                    enclosedIn "params"
                    desc "三层网络UUID"
                    location "url"
                    type "String"
                    optional false
                    since "0.6"

                }
                column {
                    name "staticIp"
                    enclosedIn "params"
                    desc ""
                    location "body"
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
            clz APIAttachL3NetworkToVmEvent.class
        }
    }
}