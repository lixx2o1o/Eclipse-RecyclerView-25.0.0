/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package lixx.android.support.v4.view;

import android.view.View;
import android.graphics.Rect;

/**
 * Jellybean MR2 - specific View API access.
 */
class ViewCompatJellybeanMr2 {

    public static Rect getClipBounds(View view) {
        return view.getClipBounds();
    }

    public static void setClipBounds(View view, Rect clipBounds) {
        view.setClipBounds(clipBounds);
    }

    public static boolean isInLayout(View view) {
        return view.isInLayout();
    }
}
