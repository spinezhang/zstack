package org.zstack.sdk;

import java.util.HashMap;
import java.util.Map;

public class QuerySecurityGroupRuleAction extends QueryAction {

    private static final HashMap<String, Parameter> parameterMap = new HashMap<>();

    public static class Result {
        public ErrorCode error;
        public QuerySecurityGroupRuleResult value;

        public Result throwExceptionIfError() {
            if (error != null) {
                throw new ApiException(
                    String.format("error[code: %s, description: %s, details: %s]", error.code, error.description, error.details)
                );
            }
            
            return this;
        }
    }



    public Result call() {
        ApiResult res = ZSClient.call(this);
        Result ret = new Result();
        if (res.error != null) {
            ret.error = res.error;
            return ret;
        }
        
        QuerySecurityGroupRuleResult value = res.getResult(QuerySecurityGroupRuleResult.class);
        ret.value = value == null ? new QuerySecurityGroupRuleResult() : value;
        return ret;
    }

    public void call(final Completion<Result> completion) {
        ZSClient.call(this, new InternalCompletion() {
            @Override
            public void complete(ApiResult res) {
                Result ret = new Result();
                if (res.error != null) {
                    ret.error = res.error;
                    completion.complete(ret);
                    return;
                }
                
                QuerySecurityGroupRuleResult value = res.getResult(QuerySecurityGroupRuleResult.class);
                ret.value = value == null ? new QuerySecurityGroupRuleResult() : value;
                completion.complete(ret);
            }
        });
    }

    Map<String, Parameter> getParameterMap() {
        return parameterMap;
    }

    RestInfo getRestInfo() {
        RestInfo info = new RestInfo();
        info.httpMethod = "GET";
        info.path = "/security-groups/rules";
        info.needSession = true;
        info.needPoll = false;
        info.parameterName = "";
        return info;
    }

}
