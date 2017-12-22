package net.tnemc.core.permissions.node;

import net.tnemc.core.utils.SplitHelper;

/**
 * Created by creatorfromhell on 12/21/2017.
 * <p>
 * Reserve API
 * <p>
 * Copyright (C) 2017 creatorfromhell
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **/
public class NodePath {

  public static final SplitHelper helper = new SplitHelper(".");
  private Node root;

  public NodePath(Node root) {
    this.root = root;
  }

  public Node getRoot() {
    return root;
  }
}