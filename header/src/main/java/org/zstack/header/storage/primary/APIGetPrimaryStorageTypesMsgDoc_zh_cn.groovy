package org.zstack.header.storage.primary

import org.zstack.header.storage.primary.APIGetPrimaryStorageTypesReply

doc {
    title "GetPrimaryStorageTypes"

    category "storage.primary"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/primary-storage/types"


            header (OAuth: 'the-session-uuid')

            clz APIGetPrimaryStorageTypesMsg.class

            desc ""
            
			params {

				column {
					name "systemTags"
					enclosedIn ""
					desc "系统标签"
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "userTags"
					enclosedIn ""
					desc "用户标签"
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
			}
        }

        response {
            clz APIGetPrimaryStorageTypesReply.class
        }
    }
}