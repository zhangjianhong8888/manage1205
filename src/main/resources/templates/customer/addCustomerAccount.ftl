<#include "layout.ftl">


<@layout ; section>

    <#if section = "head">

    <#elseif section = "content" >

    <div class="page-content">

        <div class="container-fluid">

            <div class="row-fluid">

                <div class="span12">

                    <h3 class="page-title">

                        新增客户

                    </h3>

                    <ul class="breadcrumb">

                        <li>

                            <i class="icon-home"></i>

                            <a href="index.html">首页</a>

                            <span class="icon-angle-right"></span>

                        </li>

                        <li>

                            <a href="#">客户管理</a>

                            <span class="icon-angle-right"></span>

                        </li>

                        <li>

                            <a href="#">客户列表</a>

                            <span class="icon-angle-right"></span>

                        </li>

                        <li><a href="#">新增账号</a></li>

                    </ul>

                </div>

            </div>

            <div class="row-fluid">

                <div class="span12">

                    <!-- BEGIN VALIDATION STATES-->

                    <div class="portlet box light-grey">

                        <div class="portlet-title">

                            <div class="caption"><i class="icon-reorder"></i>请填写客户信息</div>

                            <div class="tools">

                                <a href="javascript:;" class="collapse"></a>

                                <a href="#portlet-config" data-toggle="modal" class="config"></a>

                                <a href="javascript:;" class="reload"></a>

                                <a href="javascript:;" class="remove"></a>

                            </div>

                        </div>

                        <div class="portlet-body form">

                            <!-- BEGIN FORM-->

                            <form action="/customer/addCustomerAccountAction" id="form_sample_1" class="form-horizontal">

                                <div class="control-group"></div>

                                <div class="control-group"></div>

                                <#if msg??>

                                    <div class="alert alert-error show">

                                        <button class="close" data-dismiss="alert"></button>

                                    ${msg}

                                    </div>

                                </#if>

                                <div class="control-group" style="display: none">

                                    <label class="control-label">请输入公司名称<span class="required">*</span></label>

                                    <div class="controls">

                                        <input type="text" name="companyId" <#if companyId??>value="${companyId}"</#if> data-required="1" class="span6 m-wrap"/>

                                    </div>

                                </div>

                                <div class="control-group">

                                    <label class="control-label">请输入账号<span class="required">*</span></label>

                                    <div class="controls">

                                        <input type="text" id="customer_authId" name="authId" data-required="1" class="span6 m-wrap"/>

                                        <span id="customer_authIdMsg" class="help-inline"><#if CustomerMessageAuthId??><font color="red">${CustomerMessageAuthId}</font></#if></span>

                                        <span class="help-block">e.g：只能有数字、字母、下划线组成</span>

                                    </div>

                                </div>

                                <div class="form-actions">

                                    <button type="submit" class="btn black">确定</button>

                                    <button type="button" class="btn">取消</button>

                                </div>

                            </form>

                            <!-- END FORM-->

                        </div>

                    </div>

                    <!-- END VALIDATION STATES-->

                </div>

            </div>

        </div>

    </div>
    <script src="/js/myjs/addcompanyandcustomeralldept.js" type="text/javascript"></script>

    <#elseif section = "footer">

    </#if>

</@layout>

