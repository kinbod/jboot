/**
 * Copyright (c) 2015-2022, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jboot.test.other;

import io.jboot.test.db.model.User;
import io.jboot.utils.ModelUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author michael yang (fuhai999@gmail.com)
 * @Date: 2020/2/9
 */
public class ModelUtilTest {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User());

        List<User> newUsers = ModelUtil.copy(users);

        System.out.println("users == newUsers ---> " + (users == newUsers));
        System.out.println("users.get(0) == newUsers.get(0) ---> " + (users.get(0) == newUsers.get(0)));


        User[] userArray = new User[]{ new User()};
        User[] newUserArray = ModelUtil.copy(userArray);


        System.out.println("userArray == newUserArray ---> " + (userArray == newUserArray));
        System.out.println("userArray[0] == newUserArray[0] ---> " + (userArray[0] == newUserArray[0]));
    }

}