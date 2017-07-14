/**
 * Copyright (c) 2015-2017, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jboot.exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michael on 2017/7/6.
 */
public class JbootExceptionHolder {

    static ThreadLocal<List<Throwable>> throwables = new ThreadLocal<>();

    public static void init() {
        throwables.set(new ArrayList<>());
    }

    public static void release() {
        throwables.get().clear();
        throwables.remove();
    }

    public static void hold(Throwable ex) {
        List<Throwable> list = throwables.get();
        if (list != null) {
            list.add(ex);
        }
    }

    public static List<Throwable> throwables() {
        return throwables.get();
    }


}
