package org.zstack.header.storage.backup

import org.zstack.header.storage.backup.APIGetBackupStorageCapacityReply

doc {
    title "GetBackupStorageCapacity"

    category "storage.backup"

    desc "在这里填写API描述"

    rest {
        request {
			url "GET /v1/backup-storage/capacities"


            header (OAuth: 'the-session-uuid')

            clz APIGetBackupStorageCapacityMsg.class

            desc ""
            
			params {

				column {
					name "zoneUuids"
					enclosedIn "params"
					desc ""
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "backupStorageUuids"
					enclosedIn "params"
					desc ""
					location "query"
					type "List"
					optional true
					since "0.6"
					
				}
				column {
					name "all"
					enclosedIn "params"
					desc ""
					location "query"
					type "boolean"
					optional true
					since "0.6"
					
				}
				column {
					name "systemTags"
 					enclosedIn ""
 					desc ""
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
            clz APIGetBackupStorageCapacityReply.class
        }
    }
}