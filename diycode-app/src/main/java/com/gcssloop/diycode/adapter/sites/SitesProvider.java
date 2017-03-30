/*
 * Copyright 2017 GcsSloop
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Last modified 2017-03-28 03:38:06
 *
 * GitHub:  https://github.com/GcsSloop
 * Website: http://www.gcssloop.com
 * Weibo:   http://weibo.com/GcsSloop
 */

package com.gcssloop.diycode.adapter.sites;

import android.content.Context;
import android.support.annotation.NonNull;

import com.gcssloop.diycode.R;
import com.gcssloop.diycode.multitype.BaseViewProvider;
import com.gcssloop.diycode.multitype.GcsViewHolder;

public class SitesProvider extends BaseViewProvider<SitesItem> {

    public SitesProvider(@NonNull Context context) {
        super(context, R.layout.item_sites);
    }

    /**
     * 在绑定数据时调用，需要用户自己处理
     *
     * @param holder ViewHolder
     * @param bean   数据
     */
    @Override
    public void onBindView(GcsViewHolder holder, SitesItem bean) {
        holder.setText(R.id.name, bean.getName());
    }
}
