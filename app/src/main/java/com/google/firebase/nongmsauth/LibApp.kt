/**
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.firebase.nongmsauth

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*
import android.app.Application
import android.content.Context
import androidx.multidex.MultiDexApplication


/**
 * Base class for those who need to maintain global application state.
 */
abstract class LibApp : MultiDexApplication() {
    /**
     * Constructor.
     */
    init {
        instance = this
    }

    companion object {

        /** Instance of the current application.  */
        private lateinit var instance: LibApp

        /**
         * Gets the application context.
         *
         * @return the application context
         */
        val context: Context
            get() = instance
    }

}