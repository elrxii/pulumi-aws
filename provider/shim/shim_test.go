// Copyright 2023, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package shim

import (
	"context"
	"testing"
)

// This checks that any runtime checks in the underlying provider (with patches) are passed.
func TestProviderShim(t *testing.T) {
	ctx := context.Background()
	_, err := NewUpstreamProvider(ctx)
	if err != nil {
		t.Fatal(err)
	}
}
